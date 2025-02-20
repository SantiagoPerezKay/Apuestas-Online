export default function Layout({
  children,
}: Readonly<{
  children: React.ReactNode;
}>) {
  return (
    <>
      <div className="flex min-h-dvh overflow-hidden">
        <div className="grow">{children}</div>
      </div>
    </>
  );
}
